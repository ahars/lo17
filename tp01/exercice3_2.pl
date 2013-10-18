#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_2.pl

mkdir('LCI_EXTRACT_3',0755) || die ("Err. Cr. répertoire");

@files = `ls LCI_EXTRACT_2/`;

$testNbFiles = `find LCI_EXTRACT_2/ -type f | wc -l`;
$nbFiles = 0;
$nbLigneFiles = 0;
$nbRubriquesFiles = 0;

foreach $elt (@files) {

	print "Traitement de : $elt";
	$nbFiles++;
	$commande = "./exercice3_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}

print "\n";

# Test du nombre de lignes dans les fichiers une fois traités.
@files = `ls LCI_EXTRACT_3/`;
foreach $elt (@files) {

	if (`wc -l LCI_EXTRACT_3/$elt` == 5) {
		$nbLigneFiles++;
	}
	
	if (`./exercice3_2_test.pl $elt` == 1) {
		$nbRubriquesFiles++;
	}
	
}

# Test présence des éléments ajoutés.

print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "\nNombre de fichiers finaux contenant 5 lignes : $nbLigneFiles / $testNbFiles";
print "\nNombre de fichiers finaux contenant les 5 rubriques : $nbRubriquesFiles / $testNbFiles";
print "\n====================TESTS====================\n\n";

