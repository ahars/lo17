#!/usr/bin/perl

# UV : LO17 - TP02
# Préparation du Corpus
# Fichier : suppChiffres2.pl

while (<>) {
	unless(/\d+\s(.*?)\d(.*?)/) {
		print;
	}
}

