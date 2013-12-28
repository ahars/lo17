#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_test4.pl

$fichier = $ARGV[0];

open(FICH, "LCI_EXTRACT_4/$fichier") or die "Cannot open fichier: $!";

$compt = 0;

# Test du nombre de GROSTITRES traités.
while($a = <FICH>) {

	if ($a =~ /<GROSTITRE>/) {
		$compt++;
	}
}

print $compt;

close(FICH);
