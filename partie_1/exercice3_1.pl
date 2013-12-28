#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice3_1.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_2/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_3/");
$fichier =~ s/.html/.xml/;
open(FICHOUT, ">$fichier") or die "Cannot open fichier: $!";

# Mise en forme du doc avec les rubriques.
while($a = <FICHIN>) {

	$a =~ s/class="S431"/\n<UNE>class="S431"/;
	$a =~ s/class="S301">A voir aussi :/<\/UNE>\n<LES_VOIRAUSSI>class="S301">A voir aussi :/;
	$a =~ s/class="S401"/<\/LES_VOIRAUSSI>\n<FOCUS>class="S401"/;
	$a =~ s/27915/<\/FOCUS>\n<LES_GROSTITRES>27915/;
	$a =~ s/27916/<\/LES_GROSTITRES>\n<LES_RAPPELS>27916/;

	print FICHOUT $a;
}

print FICHOUT "</LES_RAPPELS>";

close(FICHOUT);
close(FICHIN);

