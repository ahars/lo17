#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice4_4.pl

$fichier1 = $ARGV[0];
$fichier2 = $ARGV[1];
$compt = 0;

open(FICHIN, "LCI_EXTRACT_3/$fichier1") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_4/");
open(FICHOUT, ">>$fichier2") or die "Cannot open fichier: $!";

print FICHOUT "\t\t<LES_GROSTITRES>\n";

# Traitement sur les GROSTITRES.
while($a = <FICHIN>) {

	if($a =~/^<LES_GROSTITRES>/) {

		#while ($a =~ /<a\s[^>]*><img\ssrc="(.*?)"\s[^>]*><\/a>.*?<span\sclass="S301">(.*?)<\/span>[^>]*<a\shref="(.*?)"\sclass="S63">(.*?)<\/a>/g) {
		
		#while ($a =~ /<a\s[^>]*><img\ssrc="(.*?)"\s[^>]*><\/a>.*?<span\sclass="S301">(.*?)<\/span>[^>]*<a\shref="(.*?)"\sclass="S63">(.*?)<\/a>(.*?)<a\s[^>]* class="S48">(.*?)<\/a><span\sclass="S48">(.??)<\/table>/g) {
		
		#while ($a =~ /<a\s[^>]*><img\ssrc="(.*?)"\s[^>]*><\/a>.*?<span\sclass="S301">(.*?)<\/span>[^<]*<a\shref="(.*?)"\sclass="S63">(.*?)<\/a>.*?<a\s[^>]* class="S48">(.*?)<\/a><span\sclass="S48">(.*?)<\/span>(.*?)<\/table>/g) {
		
		while ($a =~ /<a\s[^>]*><img\ssrc="(.*?)"\s[^>]*><\/a>(.*?)<\/table>/g) {
				
			# print FICHOUT "\t\t\t\t<contenu1>$1</contenu1>\n";
			# print FICHOUT "\t\t\t\t<contenu2>$2</contenu2>\n";
			
			$pictureUrl = $1;
			$tmp = $2;
			
			#$2 =~/<span\sclass="48">(.)<\/span>/
			
			$tmp =~ /<a\shref="(.*?)"\sclass="S63"/;
			print FICHOUT "\t\t\t<GROSTITRE>\n";
			print FICHOUT "\t\t\t\t<urlArticle>$1</urlArticle>\n";

			$tmp =~/<span class="S301">(.*?)<\/span>/;
			print FICHOUT "\t\t\t\t<themeArticle>$1</themeArticle>\n";

			$tmp =~ /class="S63">(.*?)<\/a>/;
			print FICHOUT "\t\t\t\t<titreArticle>$1</titreArticle>\n";
			
			if ($tmp =~/<span\sclass="48">\(([^)]*)\)<\/span>/)
			#$date = $1;
			#$date =~ /(\d\d\d\d)\/(\d\d)\/(\d\d)/;
			{
				print FICHOUT "\t\t\t\t<dateArticle>$1</dateArticle>\n";
			}
			#else : on n'affiche rien (pas de balise vide)

			print FICHOUT "\t\t\t\t<urlImage>$pictureUrl</urlImage>\n";

			$tmp =~ /class="S48">(.*?)<\/a>/;
			print FICHOUT "\t\t\t\t<resumeArticle>$1</resumeArticle>\n";

			if ($tmp =~/<a href="mailto:(.*?)"/) {
				print FICHOUT "\t\t\t\t<mailto>$1</mailto>\n";
			} 
			#else : on n'affiche rien (pas de balise vide)

			
			if ($tmp =~/class="S14">(.*?)<\/a>/) {
				print FICHOUT "\t\t\t\t<auteur>$1</auteur>\n";
			} 
			#else : on n'affiche rien (pas de balise vide)

			# $fichier1 =~ /(\d\d\d\d)-(\d\d)-(\d\d)/;
			# print FICHOUT "\t\t\t\t<dateArticle>$3/$2/$1</dateArticle>\n";

			print FICHOUT "\t\t\t</GROSTITRE>\n";
			
			$compt++;
		}
	}
}
print FICHOUT "\t\t</LES_GROSTITRES>\n";
print $compt;

close(FICHOUT);
close(FICHIN);

