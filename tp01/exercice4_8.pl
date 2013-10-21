#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_7.pl

$fichier = "corpus_lci.xml";
@files = `ls LCI_EXTRACT_3/`;

$testNbFiles = `find LCI_EXTRACT_2/ -type f | wc -l`;
$nbFiles = 0;

$c = `./exercice4_0.pl $fichier`;

foreach $elt (@files) {

	print "Traitement de : $elt";
	$nbFiles++;
	# Le foreach ajoute un \n à éliminer..
	$elt =~ s/\n//g;

	$c = `./exercice4_1.pl $elt $fichier`;

	$c = `./exercice4_2.pl $elt $fichier`;

	$c = `./exercice4_3.pl $elt $fichier`;

	$c = `./exercice4_4.pl $elt $fichier`;

	$c = `./exercice4_5.pl $elt $fichier`;
}

$c = `./exercice4_6.pl $fichier`;

print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "\n====================TESTS====================\n\n";

