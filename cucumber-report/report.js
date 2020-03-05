$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/createAccount.feature");
formatter.feature({
  "name": "Inscription de l\u0027utilisateur",
  "description": "  --\u003e L\u0027utilisateur doit être inscrit avec succès si l\u0027email n\u0027existe pas déjà dans la base de données.\n  --\u003e un message d\u0027erreur s\u0027affiche si l\u0027email existe déjà dans la base de données.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Inscription réussie",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cucumber"
    }
  ]
});
formatter.step({
  "name": "Qu\\\u0027il y\\\u0027a aucun account avec l\\\u0027email \"test@test.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountStepdefs.quIlYAAucunAccountAvecLEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Un nouveau user essaie de s\\\u0027inscrire avec l\\\u0027email \"test@test.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountStepdefs.unNouveauUserEssaieDeSInscrireAvecLEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Un nouveau compte est crée avec l\\\u0027email \"test1@test.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountStepdefs.unNouveauCompteEstCréeAvecLEmail(String)"
});
formatter.result({
  "status": "passed"
});
});