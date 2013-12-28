#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_2.pl

$rm = `rm -r LCI_EXTRACT_3`;
mkdir('LCI_EXTRACT_3',0755) || die ("Err. Cr. répertoire");

@files = `ls LCI_EXTRACT_2/`;
$testNbFiles = `find LCI_EXTRACT_2/ -type f | wc -l`;

$nbFiles = 0;
$nbFiles0 = 0;
$nbFiles1 = 0;
$nbFiles2 = 0;
$nbFiles3 = 0;
$nbFiles4 = 0;
$nbFiles5 = 0;
$nbRubriquesFiles0 = 0;
$nbRubriquesFiles1 = 0;
$nbRubriquesFiles2 = 0;
$nbRubriquesFiles3 = 0;
$nbRubriquesFiles4 = 0;
$nbRubriquesFiles5 = 0;

foreach $elt (@files) {

	print "Traitement de : $elt";
	$nbFiles++;
	$c = `./exercice3_1.pl $elt`;
}

# Récupération du nombre de rubriques dans les fichiers de bases.
@files = `ls LCI_EXTRACT_2/`;
foreach $elt (@files) {

	$nb = `./exercice3_test1.pl $elt`;
	if ($nb == 0) {	$nbFiles0++; }

	if ($nb == 1) {	$nbFiles1++; }

	if ($nb == 2) {	$nbFiles2++; }

	if ($nb == 3) {	$nbFiles3++; }

	if ($nb == 4) {	$nbFiles4++; }

	if ($nb == 5) {	$nbFiles5++; }
}

# Test du nombre de rubriques dans les fichiers une fois traités.
@files = `ls LCI_EXTRACT_3/`;
foreach $elt (@files) {

	$nb = `./exercice3_test2.pl $elt`;
	if ($nb == 0) {	$nbRubriquesFiles0++; }

	if ($nb == 1) {	$nbRubriquesFiles1++; }

	if ($nb == 2) {	$nbRubriquesFiles2++; }

	if ($nb == 3) {	$nbRubriquesFiles3++; }

	if ($nb == 4) {	$nbRubriquesFiles4++; }

	if ($nb == 5) {	$nbRubriquesFiles5++; }
}

print "\nCréation d'une ligne par rubrique";
print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "Nombre de fichiers finaux contenant 5 rubriques : $nbRubriquesFiles5 / $nbFiles5";
print "\nNombre de fichiers finaux contenant 4 rubriques : $nbRubriquesFiles4 / $nbFiles4";
print "\nNombre de fichiers finaux contenant 3 rubriques : $nbRubriquesFiles3 / $nbFiles3";
print "\nNombre de fichiers finaux contenant 2 rubriques : $nbRubriquesFiles2 / $nbFiles2";
print "\nNombre de fichiers finaux contenant 1 rubrique : $nbRubriquesFiles1 / $nbFiles1";
print "\nNombre de fichiers finaux contenant 0 rubrique : $nbRubriquesFiles0 / $nbFiles0\n";
print "\n====================TESTS====================\n\n";

