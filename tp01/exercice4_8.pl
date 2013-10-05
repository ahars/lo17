#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_7.pl

$fichier = "corpus_lci.xml";
@files = `ls LCI_EXTRACT_3/`;
$nbFiles = 0;

$commande = "./exercice4_0.pl $fichier";
system($commande) == 0 or die "Erreur de la commande : $commande\n";

foreach $elt (@files) {

	print "$elt";
	$nbFiles++;
	# Le foreach ajoute un \n à éliminer..
	$elt =~ s/\n//g;

	$commande = "./exercice4_1.pl $elt $fichier";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_2.pl $elt $fichier";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_3.pl $elt $fichier";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_4.pl $elt $fichier";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";

	$commande = "./exercice4_5.pl $elt $fichier";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}
$commande = "./exercice4_6.pl $fichier";
system($commande) == 0 or die "Erreur de la commande : $commande\n";

print "Nombre de fichiers traités : $nbFiles\n";

