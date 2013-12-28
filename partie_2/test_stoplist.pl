#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : test_stoplist.pl

open(FICH1, "stoplist.txt") or die "Cannot open fichier: $!";
open(FICH2, "corpus1.xml") or die "Cannot open fichier: $!";

@list = ();

while ($a = <FICH1>) {

	$a =~ /(.*?)\n/;
	push(@list, $1);
}

while ($a = <FICH2>) {

	foreach my $v (@list) {
		if ($a =~ /\s$v\s/) {

			print "$a Test de stoplist non concluant pour $v\n";
		}
	}
}

close(FICH1);
close(FICH2);
