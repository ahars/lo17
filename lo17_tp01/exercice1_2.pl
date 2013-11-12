#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice1_2.pl

$rm = `rm -r LCI_EXTRACT_1`;
mkdir('LCI_EXTRACT_1',0755) || die ("Err. Cr. répertoire\n");

@files = `ls LCI/`;

$testNbFiles = `find LCI/ -type f | wc -l`;
$nbFiles = 0;

# Exécution du script exercice1_1.pl sur tous les fichiers du dossier LCI.
foreach $elt (@files) {

	print "Traitement de : $elt";
	$nbFiles++;
	$commande = "./exercice1_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}

print "\nNormalisation des fichiers au format iso8859-1";
print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "\n====================TESTS====================\n\n";
