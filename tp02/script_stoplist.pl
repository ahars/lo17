#!/usr/bin/perl

while (<>) {
	if (/<resumeArticle>/ || /<titreArticle>/) {
		tr/A-Z/a-z/;
		s/resumearticle/resumeArticle/g;
		s/titrearticle/titreArticle/g;
		}
	print $_
	}
