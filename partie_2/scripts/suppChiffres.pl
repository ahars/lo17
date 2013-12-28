#!/usr/bin/perl

# UV : LO17 - partie 2
# Préparation du Corpus
# Fichier : suppChiffres.pl

while (<>) {
	unless(/^\d/) {
		print;
	}
}

