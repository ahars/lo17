#!/usr/bin/perl

# UV : LO17 - partie 1
# Pr�paration du Corpus
# Auteurs : Dany Ferreira - Antoine Hars
# Fichier : convert.pl

use Unicode::String qw(utf8 latin1);

# Sp�cification du format par d�faut des cha�nes en entr�e
Unicode::String->stringify_as('utf8');

while(<>) {

	# Convertion de la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
	# pour que le document converti puisse toujours
	# �tre affich� correctement par un navigateur
	(/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

	# Instanciation la cha�ne en objet au format "neutre"
	$u = Unicode::String->new($_);

	# Retranscription de la cha�ne sous un format iso8859-1
	print $u->latin1;
}

