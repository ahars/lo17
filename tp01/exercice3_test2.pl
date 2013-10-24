#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_test2.pl

$fichier = $ARGV[0];

open(FICH, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";

$compt = 0;

# Test du nombre de rubriques.
while($a = <FICH>) {

	if ($a =~ /<UNE>/) {
		$compt++;
	}
	
	if ($a =~ /<LES_VOIRAUSSI>/) {
		$compt++;
	}
	
	if ($a =~ /<FOCUS>/) {
		$compt++;
	}

	if ($a =~ /<LES_GROSTITRES>/) {
		$compt++;
	}

	if ($a =~ /<LES_RAPPELS>/) {
		$compt++;
	}
}

print $compt;

close(FICH);
