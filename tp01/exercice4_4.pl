#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_4.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier") or die "Cannot open fichier: $!";

print FICHOUT "<LES_GROSTITRES>\n";

# Traitement sur les GROSTITRES.
while($a = <FICHIN>) {	

	if($a =~/^<LES_GROSTITRES>/) {
	
		while ($a =~ /<span class="S301">(.*?)<\/span>[^>]*<a\shre=(.*?)\sclass="S63">(.*?)<\/a>/g) {

			# $a =~ /<a\shre=(.*?)\sclass="S63"/;
			print FICHOUT "<GROSTITRE>\n";
			print FICHOUT "\t<urlArticle>$2</urlArticle>\n";

			# $a =~/<span class="S301">(.*?)<\/span>/;
			print FICHOUT "\t<themeArticle>$1</themeArticle>\n";

			# $a =~ /class="S63">(.*?)<\/a>/;
			print FICHOUT "\t<titreArticle>$3</titreArticle>\n";

			# $a =~/<img\ssrc="(.*?)"/; MARCHE PAS
			print FICHOUT "\t<urlImage></urlImage>\n";

			# $a =~ /class="S48">(.*?)<\/a>/; MARCHE PAS AVEC LE WHILE
			print FICHOUT "\t<resumeArticle></resumeArticle>\n";

			# $a =~/<a hre="mailto:(.*?)"/; MARCHE PAS AVEC LE WHILE
			print FICHOUT "\t<mailto></mailto>\n";

			# $a =~/class="S14">(.*?)<\/a>/; MARCHE PAS AVEC LE WHILE
			print FICHOUT "\t<auteur></auteur>\n";

			$fichier =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
			print FICHOUT "\t<dateArticle>$3/$2/$1</dateArticle>\n";

			print FICHOUT "</GROSTITRE>\n";
		}
	
	}
}
print FICHOUT "\n</LES_GROSTITRES>\n";
close(FICHOUT);
close(FICHIN);

