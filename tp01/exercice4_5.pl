#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_5.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier") or die "Cannot open fichier: $!";

print FICHOUT "<LES_RAPPELS>\n";

# Traitement sur les RAPPELS.
while($a = <FICHIN>) {	

	if($a =~/^<LES_RAPPELS>/) {

		while ($a =~/<span class="S48">(.*?)<\/span>[^>]*<span class="S301">(.*?)<\/span>[^>]*<a\shre=(.*?)\sclass="S63">(.*?)<\/a>/g) {

			print FICHOUT "<RAPPEL>\n";
			print FICHOUT "\t<dateArticle>$1</dateArticle>\n";

#			$a =~/<span class="S301">(.*?)<\/span>/;
			print FICHOUT "\t<themeArticle>$2</themeArticle>\n";
		
#			$a =~/<a\shre=(.*?)\sclass="S63">/;
			print FICHOUT "\t<urlArticle>$3</urlArticle>\n";

#			$a =~/"[^>]*class="S63">(.*?)<\/a>/;
			print FICHOUT "\t<titreArticle>$4</titreArticle>\n";
			print FICHOUT "</RAPPEL>\n";
		}
	}
}
print FICHOUT "\n</LES_RAPPELS>\n</PAGE_LCI>\n</CORPUS>";

close(FICHOUT);
close(FICHIN);

