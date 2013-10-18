#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_2_test.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";

$compt = 0;

# Test du nombre de rubriques.
while($a = <FICHIN>) {	

	if ($a =~ /<UNE>(.*?)<\/UNE>/) {
		$compt++;
	}
	if ($a =~ /<LES_VOIRAUSSI>(.*?)<\/LES_VOIRAUSSI>/) {
		$compt++;
	}
	if ($a =~ /<FOCUS>(.*?)<\/FOCUS>/) {
		$compt++;
	}

	if ($a =~ /<LES_GROSTITRES>(.*?)<\/LES_GROSTITRES>/) {
		$compt++;
	}

	if ($a =~ /<LES_RAPPELS>(.*?)<\/LES_RAPPELS>/) {
		$compt++;
	}
}

print "$compt rubriques\n";
#print $compt / 5;

close(FICHIN);

