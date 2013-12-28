#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_6.pl

$fichier = $ARGV[0];

chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier") or die "Cannot open fichier: $!";

print FICHOUT "</CORPUS>";

close(FICHOUT);

