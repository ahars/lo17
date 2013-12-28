#!/usr/bin/perl

# UV : LO17 - partie 2
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : stoplist_creation.pl

open(FICHTFIDF, "tfidf.txt") or die "Cannot open fichier: $!";

@stoplist;

while($a = <FICHTFIDF>) {

	$a =~ /(.*?)\t(.*?)\t(.*?)\n/;
	# On a choisit le tf * idf du mot président.
	if ($3 > 0.413116254843684) {
		# print "$3\t$2\n";
	} else {

		$val = $2;
		unless(defined($idf{$val})) {
			# push(@stoplist, $val);
			$stoplist{$val} = 1;
			# print "$val\n";
		}
	}
}

# print @stoplist;
foreach my $k (keys(%stoplist)) {

	# print "Clef = $k Valeur = $stoplist{$k}\n";
	if ($k eq "pays") {}
	else {
		print $k;
		print "\n";
	}
}

close(FICHTFIDF);

