#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_1.pl

$fichier1 = $ARGV[0];
$fichier2 = $ARGV[1];
$compt = 0;

open(FICHIN, "LCI_EXTRACT_3/$fichier1") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier2") or die "Cannot open fichier: $!";

print FICHOUT "\t<PAGE_LCI>\n\t\t<FICHIER>$fichier1</FICHIER>\n";

$fichier1 =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
print FICHOUT "\t\t<DATE_PAGE>$3/$2/$1</DATE_PAGE>";
print FICHOUT "\n\t\t<UNE>\n";

# Traitement sur la UNE.
while($a = <FICHIN>) {	

	if($a =~/^<UNE>/) {

		if ($a =~/<a href=(.*?)>/) {
			print FICHOUT "\t\t\t<urlArticle>$1</urlArticle>\n";
		} else {
			print FICHOUT "\t\t\t<urlArticle>PAS D'INFORMATIONS</urlArticle>\n";
		}

		if ($a =~/">(.*?)<\/a>/) {
			print FICHOUT "\t\t\t<titreArticle>$1</titreArticle>\n";
		} else {
			print FICHOUT "\t\t\t<titreArticle>PAS D'INFORMATIONS</titreArticle>\n";
		}
		
		# On suppose que la date de l'article est la date de la page
		$fichier1 =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
		print FICHOUT "\t\t\t<dateArticle>$3/$2/$1</dateArticle>\n";
		
		if ($a =~/<a\s[^>]*><img\ssrc="(.*?)"\s[^>]*><\/a>/) {
			print FICHOUT "\t\t\t<urlImage>$1</urlImage>\n";
		} else {
			print FICHOUT "\t\t\t<urlImage>PAS D'INFORMATIONS</urlImage>\n";
		}

		# $a =~/<a[^>]class="S48"><img[^>]>(.*)<\/a>/;
		# $a =~/<a [^>] class="S48">(.+?)<\/a>/g;

		print FICHOUT "\t\t\t<resumeArticle>";
		
		while ($a =~/<a[^>]*class="S48"><img[^>]*>(.+?)<\/a>/g) {
			print FICHOUT "$1";
		}
		print FICHOUT "</resumeArticle>\n";
		
		if ($a =~/<a href="mailto:(.*?)"/) {
			print FICHOUT "\t\t\t<mailto>$1</mailto>\n";
		}
		# Possibilité de faire apparaître qu'il n'y a pas de mailto.
		# else {
		# 	print FICHOUT "\t\t\t<mailto>PAS D'INFORMATIONS</mailto>\n";
		# }
		
		if ($a =~/class="S14">(.*?)<\/a>/) {
			print FICHOUT "\t\t\t<auteur>$1</auteur>\n";
		}
		# Possibilité de faire apparaître qu'il n'y a pas d'auteur.
		# else {
		#	print FICHOUT "\t\t\t<auteur>PAS D'INFORMATIONS</auteur>\n";
		# }
		
		$compt++;
	}
}
print FICHOUT "\t\t</UNE>\n";
print $compt;

close(FICHOUT);
close(FICHIN);

