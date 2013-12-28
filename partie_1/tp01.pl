#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : tp01.pl

print "\nPréparation du corpus";
print "\n====================ÉTAPES====================\n";
print "\n0) Dézipage de LCI.zip";
$c = `rm -r LCI/`;
$c = `unzip LCI.zip`;

print "\n1) Exécution de la conversion au format iso8859-1";
$c = `./exercice1_2.pl`;

print "\n2) Exécution de la mise en page sur une ligne";
$c = `./exercice2_2.pl`;

print "\n3) Exécution de la mise en page en rubriques";
$c = `./exercice3_2.pl`;

print "\n4) Exécution de la mise en page en corpus (un corpus pour une page LCI)";
$c = `./exercice4_7.pl`;

print "\n5) Exécution de la mise en page en corpus (un corpus pour toutes les pages LCI)\n";
$c = `./exercice4_8.pl`;

print "\n====================ÉTAPES====================\n";

