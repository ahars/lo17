#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_2_test1.pl

$fichier = $ARGV[0];

open(FICH, "LCI_EXTRACT_2/$fichier") or die "Cannot open fichier: $!";

$compt = 0;

# Test du nombre de rubriques.
while($a = <FICH>) {

	if ($a =~ /class="S431"/) {
		$compt++;
	}
	
	if ($a =~/class="S301">A voir aussi :/) {
		$compt++;
	}
	
	if ($a =~ /class="S401"/) {
		$compt++;
	}

	if ($a =~ /27915/) {
		$compt++;
	}

	if ($a =~ /27916/) {
		$compt++;
	}
}
print "$compt rubriques\n";

close(FICH);

