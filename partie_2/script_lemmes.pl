#!/usr/bin/perl

# UV : LO17 - partie 2
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : script_lemmes.pl

open(FICHIN, "preplemmes.txt") or die "Cannot open fichier: $!";
open(FICHOUT, ">lemmes.txt") or die "Cannot open fichier: $!";

while($a = <FICHIN>) {

	# Suppression du nombre d'occurrences.
	$a =~ s/(\s+)(\d+)\s(.*?)//g;
	print FICHOUT $a;
}

close(FICHIN);
close(FICHOUT);

