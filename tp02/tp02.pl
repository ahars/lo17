#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : tp02.pl

# $fichier = "../tp01/LCI_EXTRACT_4/corpus_lci.xml";
$fichier = "corpusA09.xml";

# Paramétrage de la langue française dans le système.
# setenv LANG C;

# Calcul de tf.
print "Calcul de tf\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | scripts/suppChiffres.pl | sort | uniq -c > tf.txt`;

# Calcul de df.
print "Calcul de df\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl > df.txt`;

# Calcul de idf.
print "Calcul de idf\n";
$c = `cat $fichier | scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn | scripts/suppChiffres.pl | ./calcul_idf.pl > idf.txt`;

# Calcul de tf * idf.
print "Calcul de tf * idf\n";
$c = `./calcul_tfidf.pl | sort -k 3 > tfid.txt`;

