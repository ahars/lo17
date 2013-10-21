#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : tp01.pl

print "0) Dézipage de LCI.zip\n";
$c = `rm -r LCI/`;
$c = `unzip LCI.zip`;

print "1) Exécution de la conversion en UTF-8\n";
$c = `./exercice1_2.pl`;

print "2) Exécution de la mise en page sur une ligne\n";
$c = `./exercice2_2.pl`;

print "3) Exécution de la mise en page en rubriques\n";
$c = `./exercice3_2.pl`;

print "4) Exécution de la mise en page en corpus (un corpus pour une page LCI)\n";
$c = `./exercice4_7.pl`;

print "5) Exécution de la mise en page en corpus (un corpus pour toutes les pages LCI)\n";
$c = `./exercice4_8.pl`;

