#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Fichier : suppChiffres.pl

while (<>) {
	unless(/^\d/) {
		print;
	}
}

