#!/usr/bin/perl

# UV : LO17 - partie 1
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_2.pl

$fichier1 = $ARGV[0];
$fichier2 = $ARGV[1];
$compt = 0;

open(FICHIN, "LCI_EXTRACT_3/$fichier1") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier2") or die "Cannot open fichier: $!";

print FICHOUT "\t\t<LES_VOIRAUSSI>\n";

# Traitement sur les VOIRAUSSI.
while($a = <FICHIN>) {

	if($a =~ /^<LES_VOIRAUSSI>/) {

		while ($a =~ /<a\shref=(.*?)\s[^>]*class="S48">(.*?)\((.*?)\)/g) {

			# $a =~ /\((.*?)\)/g;
			print FICHOUT "\t\t\t<VOIRAUSSI>\n";
			print FICHOUT "\t\t\t\t<dateArticle>$3</dateArticle>\n";

			# $a =~ /<a\shref=(.*?)\s/g;
			print FICHOUT "\t\t\t\t<urlArticle>$1</urlArticle>\n";

			# $a =~ /class="S48">(.*?)\(/;
			print FICHOUT "\t\t\t\t<titreArticle>$2</titreArticle>\n";
			print FICHOUT "\t\t\t</VOIRAUSSI>\n";
			
			$compt++;
		}
	}
}

print FICHOUT "\t\t</LES_VOIRAUSSI>\n";
print $compt;

close(FICHOUT);
close(FICHIN);

