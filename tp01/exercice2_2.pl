#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice2_2.pl

mkdir('LCI_EXTRACT_2',0755) || die ("Err. Cr. répertoire\n");

@files = `ls LCI_EXTRACT_1/`;

$testNbFiles = `find LCI_EXTRACT_1/ -type f | wc -l`;
$nbFiles = 0;
$nbLigneFiles = 0;

foreach $elt (@files) {

	print "Traitement de : $elt";
	$nbFiles++;
	$commande = "./exercice2_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}

# Test du nombre de lignes dans les fichiers une fois traités.
@files = `ls LCI_EXTRACT_2/`;
foreach $elt (@files) {

	$commande = `wc -l LCI_EXTRACT_2/$elt`;
	# Pour une raison inconnue, wc -l sur les fichiers renvoie un nombre de lignes = 0 alors que nous avons une ligne...
	if ($1 < 2) {
		$nbLigneFiles++;
	}
}

print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "Nombre de fichiers finaux ne contenant qu'une ligne : $nbLigneFiles / $testNbFiles";
print "\n====================TESTS====================\n\n";

