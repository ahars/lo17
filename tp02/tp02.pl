#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : tp02.pl

# $fichier = "corpusA09.xml";
$fichier = "../tp01/LCI_EXTRACT_4/corpus_lci.xml";

# Paramétrage de la langue française dans le système.
# setenv LANG C;

$corpus1 = "corpus1.xml";
$corpus2 = "corpus2.xml";

# Calcul de tf.
print "1) Calcul de tf\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | scripts/suppChiffres.pl | sort | uniq -c > tf.txt`;

# Calcul de df.
print "2) Calcul de df\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl > df.txt`;

# Calcul de idf.
print "3) Calcul de idf\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl | ./calcul_idf.pl > idf.txt`;

# Calcul de tf * idf.
print "4) Calcul de tf * idf\n";
$c = `./calcul_tfidf.pl | sort -k 3 > tfidf.txt`;

# Création de la stoplist.
print "5) Création de la stoplist\n";
$c = `./stoplist_creation.pl > stoplist.txt`;

# Création du script pour appliquer la stoplist sur le corpus.
print "6) Création du script d'application de la stoplist\n";
$c = `./scripts/newcreeFiltre.pl stoplist.txt > script_stoplist.pl`;
$c = `chmod +x script_stoplist.pl`;

# Application du script de la stoplist sur le corpus.
print "7) Application de la stoplist sur le corpus\n";
$c = `./script_stoplist.pl $fichier > $corpus1`;

# Préparation des lemmes.
print "8) Préparation du fichier de lemmes\n";
$c = `cat $corpus1 | scripts/newsegmente.pl -f | scripts/suppChiffres.pl | sort -u | cut -f1 | uniq -c | sort > preplemmes.txt`;
$c = `./script_lemmes.pl`;

# Création du fichier de successeurs.
print "9) Création du fichier des successeurs\n";
$c = `scripts/successeurs_2013.pl lemmes.txt | sort -k2 > successeurs.txt`;

# Création du fichier de troncation.
print "10) Création du fichier de troncation\n";
$c = `./scripts/filtronc.pl -v successeurs.txt > filtronc.txt`;

# Création du script comprenant la troncation.
print "11) Création du script de troncation\n";
$c = `./scripts/newcreeFiltre.pl filtronc.txt > script_filtre_lemmes.pl`;
$c = `chmod +x script_filtre_lemmes.pl`;

# Lemmatisation du corpus.
print "12) Lemmatisation du corpus\n";
$c = `./script_filtre_lemmes.pl $corpus1 > $corpus2`;

# Création du fichier inverse pour chaque balise.
print "13) Création du fichier inverse pour les balises du corpus\n";
@balises = ("titreArticle", "dateArticle", "urlImage", "resumeArticle", "mailto", "auteur", "themeArticle");
$i = 1;
foreach $elt (@balises) {

	print "\t$i. Création du fichier inverse pour la balise $elt\n";
	$c = `./scripts/index.pl $elt $corpus2 > inverse_$elt.txt`;
	$i++;
}

# Création du fichier d'inverses depuis le corpus.
print "14) Création du fichier d'inverses depuis le corpus\n";
$c = `cat $corpus2 | scripts/newsegmente.pl -f -a -t | scripts/newindexMot.pl > inverse.txt`;
