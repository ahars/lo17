#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_4.pl

$fichier1 = $ARGV[0];
$fichier2 = $ARGV[1];

open(FICHIN, "LCI_EXTRACT_3/$fichier1") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier2") or die "Cannot open fichier: $!";

print FICHOUT "\t\t<LES_GROSTITRES>\n";

# Traitement sur les GROSTITRES.
while($a = <FICHIN>) {

	if($a =~/^<LES_GROSTITRES>/) {

		while ($a =~ /<img\ssrc="(.*?)[^>]*<span\sclass="S301">(.*?)<\/span>[^>]*<a\shref=(.*?)\sclass="S63">(.*?)<\/a>/g) {

			# $a =~ /<a\shref="(.*?)"\sclass="S63"/;
			print FICHOUT "\t\t\t<GROSTITRE>\n";
			print FICHOUT "\t\t\t\t<urlArticle>$3</urlArticle>\n";

			# $a =~/<span class="S301">(.*?)<\/span>/;
			print FICHOUT "\t\t\t\t<themeArticle>$2</themeArticle>\n";

			# $a =~ /class="S63">(.*?)<\/a>/;
			print FICHOUT "\t\t\t\t<titreArticle>$4</titreArticle>\n";

			# NE FONCTIONNE PAS PARFAITEMENT
			# $a =~/<img\ssrc="(.*?)"/;
			print FICHOUT "\t\t\t\t<urlImage>$1</urlImage>\n";

			$a =~ /class="S48">(.*?)<\/a>/g;
			print FICHOUT "\t\t\t\t<resumeArticle>$1</resumeArticle>\n";

			# NE FONCTIONNE PAS PARFAITEMENT
			if ($a =~/<a href="mailto:(.*?)"/) {
				print FICHOUT "\t\t\t\t<mailto>$1</mailto>\n";
			} else {
				print FICHOUT "\t\t\t\t<mailto>PAS D'INFORMATIONS</mailto>\n";
			}

			# NE FONCTIONNE PAS PARFAITEMENT
			if ($a =~/class="S14">(.*?)<\/a>/) {
				print FICHOUT "\t\t\t\t<auteur>$1</auteur>\n";
			} else {
				print FICHOUT "\t\t\t\t<auteur>PAS D'INFORMATIONS</auteur>\n";
			}

			$fichier1 =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
			print FICHOUT "\t\t\t\t<dateArticle>$3/$2/$1</dateArticle>\n";

			print FICHOUT "\t\t\t</GROSTITRE>\n";
		}
	}
}
print FICHOUT "\t\t</LES_GROSTITRES>\n";

close(FICHOUT);
close(FICHIN);

