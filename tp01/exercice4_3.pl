#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_3.pl

$fichier = $ARGV[0];

open(FICHIN, "LCI_EXTRACT_3/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier") or die "Cannot open fichier: $!";

print FICHOUT "<FOCUS>";
print FICHOUT "\n";

# Traitement sur le FOCUS.
while($a = <FICHIN>) {

	if($a =~/^<FOCUS>/) {

		$a =~/\<a[^>]*hre=(.*?)\sclass="S48">/;
		print FICHOUT "\t<urlArticle>$1</urlArticle>\n";

		$a =~/">(.*?)<\/a>/;
		print FICHOUT "\t<titreArticle>$1</titreArticle>\n";

		# On suppose que la date de l'article est la date de la page
		$fichier =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
		print FICHOUT "\t<dateArticle>$3/$2/$1</dateArticle>\n";
		
		$a =~/\<img src=(.*?)\sborder/;
		@words = split(/\s+/, $1);

		foreach $elt (@words) {

			if($elt=~/.jpg/) {

				$elt =~ s/src=// ;
				print FICHOUT "\t<urlImage>$elt</urlImage>\n";
			}
		}
		$a =~/class="S48">(.*?)<\/a>/;
		print FICHOUT "\t<resumeArticle>$1</resumeArticle>\n";

		$a =~/<a hre="mailto:(.*?)"/;
		print FICHOUT "\t<mailto>$1</mailto>\n";

		$a =~/class="S14">(.*?)<\/a>/;
		print FICHOUT "\t<auteur>$1</auteur>";
	}
}
print FICHOUT "\n</FOCUS>\n";

close(FICHOUT);
close(FICHIN);

