# SocNetGen for CovidSimTeam

This repo contains the neo4j graph model and a corresponding REST API, which can be used to either 

- generate telecom/ISP/traffic flow data based on the non-deterministically generated social and physical proximity network
- or import data from various sources and recreate the underlying social and physical proximity network

To use this repo locally, please install Neo4j Desktop including a Neo4j 4.0.1+ installation and run the gradle task to 
spin up a spring boot server (on port 8069 by default).