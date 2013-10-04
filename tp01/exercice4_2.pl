#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_2.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";
#chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier") or die "Cannot open fichier: $!";

print FICHOUT "<LES_VOIRAUSSI>";
print FICHOUT "\n";

# Traitement sur les VOIRAUSSI.
while($a = <FICHIN>) {	

	if($a =~/^<LES_VOIRAUSSI>/) {

		while ($a =~ /<a\shre=(.*?)\s[^>]*class="S48">(.*?)\((.*?)\)/g) {

			# $a =~ /\((.*?)\)/;
			print FICHOUT "<VOIRAUSSI>\n";
			print FICHOUT "\t<dateArticle>$3</dateArticle>\n";

			# $a =~/<a\shre=(.*?)\s/g;
			print FICHOUT "\t<urlArticle>$1</urlArticle>\n";

			# $a =~ /class="S48">(.*?)\(/;
			print FICHOUT "\t<titreArticle>$2</titreArticle>\n";
			print FICHOUT "</VOIRAUSSI>\n";
		}
	}
}
print FICHOUT "\n</LES_VOIRAUSSI>\n";
close(FICHOUT);
close(FICHIN);

