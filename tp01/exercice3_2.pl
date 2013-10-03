#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_2.pl

mkdir('LCI_EXTRACT_3',0755) || die ("Err. Cr. répertoire \n");

@files = `ls LCI_EXTRACT_2/`;
$nbFiles = 0;

foreach $elt (@files) {

	print "$elt \n";
	$nbFiles++;
	$commande = "./exercice3_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}

print "Nombre de fichiers traités : $nbFiles\n";

