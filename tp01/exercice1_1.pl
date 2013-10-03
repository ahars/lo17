#!/usr/bin/perl

# UV : LO17 - TP01
# Préparation du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : exercice1_1.pl

use Unicode::String qw(utf8 latin1);

# Spécification du format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

$fichier = $ARGV[0];

open(FICHIN, "LCI/$fichier") or die "Cannot open fichier: $!";
chdir("LCI_EXTRACT_1");
open(FICHOUT, ">$fichier") or die "Cannot open fichier: $!";

while ($_=<FICHIN>) {

	if(/IBL_ID=27303/ || /Blc=27303/) {

		do {
			# Convertion de la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
			# pour que le document converti puisse toujours
			# être affiché correctement par un navigateur
			(/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

			# Instanciation la chaîne en objet au format "neutre"
			$u = Unicode::String->new($_);

			# Retranscription de la chaîne sous un format iso8859-1
			print FICHOUT $u->latin1;

			$_=<FICHIN>;
		}
		until(/IBL_ID=27916 - Temps/ || /Blc=27916, [0-9]+\.[0-9]+/);
		print FICHOUT;
	}
}

close (FICHIN);
close (FICHOUT);

