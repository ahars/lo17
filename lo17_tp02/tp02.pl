#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : tp02.pl

# $fichier = "corpusA09.xml";
$fichier = "../tp01/LCI_EXTRACT_4/corpus_lci.xml";

# Paramétrage de la langue française dans le système.
# $c = `setenv LANG C`;
$c = `LANG=C`;

$corpus1 = "corpus1.xml";
$corpus2 = "corpus2.xml";

print "\nIndexation du corpus";
print "\n====================ÉTAPES====================\n";

# Calcul de tf.
print "\n1) Calcul de tf";
$c = `cat $fichier | scripts/newsegmente.pl -f | scripts/suppChiffres.pl | sort | uniq -c > tf.txt`;

# Calcul de df.
print "\n2) Calcul de df";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl > df.txt`;

# Calcul de idf.
print "\n3) Calcul de idf";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl | ./calcul_idf.pl > idf.txt`;

# Calcul de tf * idf.
print "\n4) Calcul de tf * idf";
$c = `./calcul_tfidf.pl | sort -k 3 > tfidf.txt`;

# Création de la stoplist.
print "\n5) Création de la stoplist";
$c = `./stoplist_creation.pl > stoplist.txt`;

# Création du script pour appliquer la stoplist sur le corpus.
print "\n6) Création du script d'application de la stoplist";
$c = `./scripts/newcreeFiltre.pl stoplist.txt > script_stoplist.pl`;
$c = `chmod +x script_stoplist.pl`;

# Application du script de la stoplist sur le corpus.
print "\n7) Application de la stoplist sur le corpus";
$c = `./script_stoplist.pl $fichier > $corpus1`;

# Préparation des lemmes.
print "\n8) Préparation du fichier de lemmes";
$c = `cat $corpus1 | scripts/newsegmente.pl -f | scripts/suppChiffres.pl | sort -u | cut -f1 | uniq -c | sort > preplemmes.txt`;
$c = `./script_lemmes.pl`;

# Création du fichier de successeurs.
print "\n9) Création du fichier des successeurs";
$c = `scripts/successeurs_2013.pl lemmes.txt | sort -k2 > successeurs.txt`;

# Création du fichier de troncation.
print "\n10) Création du fichier de troncation";
$c = `./scripts/filtronc.pl -v successeurs.txt > filtronc.txt`;

# Création du script comprenant la troncation.
print "\n11) Création du script de troncation";
$c = `./scripts/newcreeFiltre.pl filtronc.txt > script_filtre_lemmes.pl`;
$c = `chmod +x script_filtre_lemmes.pl`;

# Lemmatisation du corpus.
print "\n12) Lemmatisation du corpus";
$c = `./script_filtre_lemmes.pl $corpus1 > $corpus2`;

# Création du fichier inverse pour chaque balise.
print "\n13) Création du fichier inverse pour les balises du corpus";
@balises = ("titreArticle", "dateArticle", "urlImage", "resumeArticle", "mailto", "auteur", "themeArticle");
$i = 1;
foreach $elt (@balises) {

	print "\n\t$i. Création du fichier inverse pour la balise $elt";
	$c = `./scripts/index.pl $elt $corpus2 > inverse_$elt.txt`;
	$i++;
}

# Création du fichier d'inverses depuis le corpus.
print "\n14) Création du fichier d'inverses depuis le corpus\n";
$c = `cat $corpus2 | scripts/newsegmente.pl -f -a -t | scripts/newindexMot.pl > inverse.txt`;

print "\n====================ÉTAPES====================\n";
