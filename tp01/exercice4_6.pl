#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_6.pl

mkdir('LCI_EXTRACT_4',0755) || die ("Err. Cr. répertoire\n");

@files = `ls LCI_EXTRACT_3/`;
$nbFiles = 0;

foreach $elt (@files) {

	print "$elt";
	$nbFiles++;
	$commande = "./exercice4_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_2.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_3.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_4.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_5.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}
print "Nombre de fichiers traités : $nbFiles\n";

