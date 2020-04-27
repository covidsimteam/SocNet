# SocNetGen for CovidSimTeam

This repo contains the neo4j graph model and a corresponding REST API, which can be used to either 

- generate telecom/ISP/traffic flow data based on the non-deterministically generated social and physical proximity network
- or import data from various sources and recreate the underlying social and physical proximity network

To use this repo locally, please install Neo4j Desktop including a Neo4j 4.0.1+ installation and run the gradle task to 
spin up a spring boot server (on port 8069 by default).

## Usage

You can use `docker-compose -f docker-compose.yml up` to get started. neo4j and spark are not yet dockerized.

## Repo stats

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Bourne Shell                     1             21             36            126
Java                             5             40              4            125
DOS Batch                        1             25              2             76
Gradle                           2              5              5             24
HTML                             1              3              0             13
Markdown                         1              3              0              6
-------------------------------------------------------------------------------
SUM:                            11             97             47            370
-------------------------------------------------------------------------------

```
