#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_7.pl

$rm = `rm -r LCI_EXTRACT_4`;
mkdir('LCI_EXTRACT_4',0755) || die ("Err. Cr. répertoire\n");

$testNbFiles = `find LCI_EXTRACT_3/ -type f | wc -l`;
$nbFiles = 0;
$nbUneFini = 0;
$nbVoirAussiFini = 0;
$nbGrosTitreFini = 0;
$nbFocusFini = 0;
$nbRappelFini = 0;

@files = `ls LCI_EXTRACT_3/`;
foreach $elt (@files) {

	# Le foreach ajoute un \n à éliminer..
	$elt =~ s/\n//g;
	
	print "Traitement de : $elt";
	$nbFiles++;
	
	$c1 = `./exercice4_0.pl $elt`;

	$c1 = `./exercice4_1.pl $elt $elt`;
	# Test sur la UNE.
	$c2 = `./exercice4_test1.pl $elt`;
	if ($c2 == $c1) { $nbUneFini++; }
	else {print " | erreur traitement UNE";}

	$c1 = `./exercice4_2.pl $elt $elt`;
	# Test sur les VOIRAUSSI.
	$c2 = `./exercice4_test2.pl $elt`;
	if ($c2 == $c1) { $nbVoirAussiFini++; }
	else {print " | erreur traitement ";}

	$c1 = `./exercice4_3.pl $elt $elt`;
	# Test sur les FOCUS.
	$c2 = `./exercice4_test3.pl $elt`;
	if ($c2 == $c1) { $nbFocusFini++; }
	else {print " | erreur traitement FOCUS";}

	$c1 = `./exercice4_4.pl $elt $elt`;
	# Test sur les GROSTITRES.
	$c2 = `./exercice4_test4.pl $elt`;
	if ($c2 == $c1) { $nbGrosTitreFini++; }
	else {print " | erreur traitement GROSTITRES";}

	$c1 = `./exercice4_5.pl $elt $elt`;
	# Test sur les RAPPELS.
	$c2 = `./exercice4_test5.pl $elt`;
	if ($c2 == $c1) { $nbRappelFini++; }
	else {print " | erreur traitement RAPPELS";}
	
	$c1 = `./exercice4_6.pl $elt`;
	
	print "\n";
}

print "\nCréation d'un corpus par fichier";
print "\n====================TESTS====================\n";
print "\nNombre de fichiers traités : $nbFiles / $testNbFiles";
print "Nombre de fichiers dont la UNE a été correctement traitée : $nbUneFini / $testNbFiles";
print "Nombre de fichiers dont les VOIRAUSSI ont été correctement traités : $nbVoirAussiFini / $testNbFiles";
print "Nombre de fichiers dont les GROSTITRES ont été correctement traités : $nbGrosTitreFini / $testNbFiles";
print "Nombre de fichiers dont le FOCUS a été correctement traité : $nbFocusFini / $testNbFiles";
print "Nombre de fichiers dont les RAPPELS ont été correctement traités : $nbRappelFini / $testNbFiles";
print "\n====================TESTS====================\n\n";

