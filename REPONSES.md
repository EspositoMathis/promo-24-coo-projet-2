## Question 1
Une méthode default d'une interface ne peux pas acceder a un attribut privee d'une classe.
La methodes isDefective() de l'interface Qualifiable utilise sa propre méthodes getQualityScore() pour recuperer le resultat se qui evite de réinplementer chaque méthode.
On doit juste surcharger la methode getQualityScore() pour que les autre m"thode soit actif et sans les surcharger.

## Question 2
La class Machine contient des attribut ce qui est impossible de mettre dans une interface , on choisit d'utiliser une interface quand on veut apprendre a une class de faire quelque chose (methode) alors qu'une class abstraite sert a implementer des attribut de comment c'est fait plutot de je sais comment faire (interface)

## Question 3 (Ex4)
canBeFulfilled(Stock stock) ne prend qu'un seul type et n'est pas flexible au sous classe coparer a canBeFulfilled(Stock<? extends Duck> stock) qui lui prend tout stock de Duck et ses sous class.

## Question ouverte
