#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice1_2.pl

mkdir('LCI_EXTRACT_1',0755) || die ("Err. Cr. répertoire\n");

@files = `ls LCI/`;

$nbFiles = 0;

# Exécution du script exercice1_1.pl sur tous les fichiers du dossier LCI.
foreach $elt (@files) {

	print "$elt";
	$nbFiles++;
	$commande = "./exercice1_1.pl $elt";
	system($commande) == 0 or die "Erreur de la commande : $commande\n";
}

print "Nombre de fichiers traités : $nbFiles\n";

