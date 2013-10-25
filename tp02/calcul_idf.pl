#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : calcul_idf.pl

while (<>) {

	chomp();
	# /([0-9]+)[\s|\t](.*?)/i;
	/(\d+)\s/;
	print $' . "\t" . log(328 / $1) . "\n";
}
