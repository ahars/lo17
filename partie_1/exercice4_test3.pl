#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_test3.pl

$fichier = $ARGV[0];

open(FICH, "LCI_EXTRACT_4/$fichier") or die "Cannot open fichier: $!";

$compt = 0;

# Test du nombre de FOCUS traités.
while($a = <FICH>) {

	if ($a =~ /<FOCUS>/) {
		$compt++;
	}
}

print $compt;

close(FICH);

