#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice2_1.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_1/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_2/");
open(FICHOUT, ">$fichier") or die "Cannot open fichier: $!";

while($a = <FICHIN>) {

	# Mise en forme du doc sur une seule ligne.
	while ($a =~ s/(\r|\n)//g) 
	{
		#print "$1\n";
	}	
	#print "$a";
	print FICHOUT $a;
}

close(FICHOUT);
close(FICHIN);

