# SocNet for CovidSimTeam

This repo contains the grakn/neo4j graph model and a corresponding REST API, which can be used to either 

- generate telecom/ISP/traffic flow data based on the non-deterministically generated social and physical proximity network
- or import data from various sources and recreate the underlying social and physical proximity network for an abstract 'population'. 


To use this repo locally, please install Grakn, NPM packages, CouchDB, Neo4j Desktop including a Neo4j 4.0.1+ installation and run the gradle task to 
spin up a spring boot server (on port 8069 by default).

## Usage

You can use `docker-compose -f docker-compose.yml up` to get started. neo4j and spark are not yet dockerized.

## Repo stats

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             6             47              4            151
Bourne Shell                     1             21             36            126
DOS Batch                        1             25              2             76
Gradle                           2              8              0             28
Markdown                         1              8              0             23
YAML                             1              1              0             22
SQL                              1              7              1             15
HTML                             1              3              0             13
Dockerfile                       1              0              0              4
-------------------------------------------------------------------------------
SUM:                            15            120             43            458
-------------------------------------------------------------------------------

```
