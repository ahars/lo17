#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : calcul_tfidf.pl

open(FICHIDF, "idf.txt") or die "Cannot open fichier: $!";
open(FICHTF, "tf.txt") or die "Cannot open fichier: $!";

@idf;

while($a = <FICHIDF>) {

	$a =~ /(.*?)\t(.*?)\n/;
	$idf{$1} = $2;
}

while($a = <FICHTF>) {

	$a =~ /(\d+)\s(.*?)\t(.*?)\n/;
	$t = $1 * $idf{$2};
	print "$3\t$2\t$t\n";
}

close(FICHIDF);
close(FICHTF);
