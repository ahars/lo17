#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_5.pl

$fichier1 = $ARGV[0];
$fichier2 = $ARGV[1];

open(FICHIN, "LCI_EXTRACT_3/$fichier1") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier2") or die "Cannot open fichier: $!";

print FICHOUT "\t\t<LES_RAPPELS>\n";

# Traitement sur les RAPPELS.
while($a = <FICHIN>) {	

	if($a =~/^<LES_RAPPELS>/) {

		while ($a =~/<span class="S48">(.*?)<\/span>[^>]*<span class="S301">(.*?)<\/span>[^>]*<a\shref=(.*?)\sclass="S63">(.*?)<\/a>/g) {

			print FICHOUT "\t\t\t<RAPPEL>\n";
			print FICHOUT "\t\t\t\t<dateArticle>$1</dateArticle>\n";

			# $a =~/<span class="S301">(.*?)<\/span>/;
			print FICHOUT "\t\t\t\t<themeArticle>$2</themeArticle>\n";
		
			# $a =~/<a\shref=(.*?)\sclass="S63">/;
			print FICHOUT "\t\t\t\t<urlArticle>$3</urlArticle>\n";

			# $a =~/"[^>]*class="S63">(.*?)<\/a>/;
			print FICHOUT "\t\t\t\t<titreArticle>$4</titreArticle>\n";
			print FICHOUT "\t\t\t</RAPPEL>\n";
		}
	}
}
print FICHOUT "\t\t</LES_RAPPELS>\n\t</PAGE_LCI>\n";

close(FICHOUT);
close(FICHIN);

