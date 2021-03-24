# gocd-plugins

Forked from [https://github.com/Haufe-Lexware/gocd-plugins](https://github.com/Haufe-Lexware/gocd-plugins), removed everything except the SonarQube Quality Gate plugin.
## SonarQube Quality Gate Plugin
Validate SonarQube quality gates from your go.cd pipeline. Checks if a specific quality gate in SonarQube is passed or if it is in error or warning state. This plugin can prevent further execution of the pipeline if a quality gate is not passed.

- Added support for SonarQube API Key to UI
- Removed failing tests

