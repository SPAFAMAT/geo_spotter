# Actors <!-- omit in toc -->
Questo file contiene le definizioni di tutti gli attori 

## Table Of Contents <!-- omit in toc -->
- [Attori primari del sito](#attori-primari-del-sito)
  - [Utente](#utente)
  - [Utente Autenticato](#utente-autenticato)
    - [Come diventarlo](#come-diventarlo)
  - [Contributor](#contributor)
    - [Come diventarlo](#come-diventarlo-1)
  - [Contributor Autorizzato](#contributor-autorizzato)
    - [Come diventarlo](#come-diventarlo-2)
  - [Curatore](#curatore)
    - [Come diventarlo](#come-diventarlo-3)
  - [Animatore](#animatore)
    - [Come diventarlo](#come-diventarlo-4)
- [Altri attori](#altri-attori)
  - [Social Media Manager](#social-media-manager)
  - [Sindaco](#sindaco)
  - [Gestore Piattaforma](#gestore-piattaforma)
- [Permessi](#permessi)
  - [Legenda](#legenda)
  - [ACL](#acl)

# Attori primari del sito

Con "attori primari del sito" si fa riferimento a colore che useranno maggiormente la piattaforma.

## Utente

E' colui che visita il sito senza aver fatto il login.

## Utente Autenticato

E' colui che visita il sito dopo essersi autenticato con le sue credenziali.

### Come diventarlo

Basta concludere il processo di registrazione al sito.

## Contributor

E' colui che **contribuisce** alla piattaforma creando proposte di aggiunta di nuovi contenuti che dovranno poi essere accettate da un [Curatore](#curatore).

### Come diventarlo

Non lo si diventa ma si nasce.

## Contributor Autorizzato

Stesso ruolo del [Contributor](#contributor), l'unica differenza è che salta il processo di accettazione delle proposte.

### Come diventarlo

Dopo aver guadagnato abbastanza "[punti fiducia](glossary.md#punti-fiducia)" contribuendo al sito, si può far richiesta per diventare [Contributor Autorizzato](#contributor-autorizzato).

## Curatore

E' colui che colui che "cura" i contenuti del sito, accettando o respingendo proposte e moderando il sito.

### Come diventarlo

Lo si nasce.

## Animatore

E' colui che crea contest o altri eventi per cercare di tenere animato il sito.

### Come diventarlo

Lo si nasce

# Altri attori

## Social Media Manager

## Sindaco

## Gestore Piattaforma

Noi programmatori.

# Permessi

## Legenda

\- -> uguale a precedente

## ACL

|                                                     |        Vedi Nodo        |      Vedi Contest       |        Crea Nodo        |      Crea Contest       |
| --------------------------------------------------: | :---------------------: | :---------------------: | :---------------------: | :---------------------: |
|                                   [Utente](#utente) | :ballot_box_with_check: | :ballot_box_with_check: |           :x:           |           :x:           |
|           [Utente Autenticato](#utente-autenticato) |            -            |            -            |            -            |            -            |
|                         [Contributor](#contributor) |            -            |            -            | :ballot_box_with_check: |            -            |
| [Contributor Autorizzato](#contributor-autorizzato) |            -            |            -            |            -            |            -            |
|       [Social Media Manager](#social-media-manager) |            -            |            -            |            -            |            -            |
|                             [Animatore](#animatore) |            -            |            -            |            -            | :ballot_box_with_check: |
|                                 [Sindaco](#sindaco) |            ?            |            ?            |            ?            |            ?            |
|         [Gestore Piattaforma](#gestore-piattaforma) |            -            |            -            |            -            |            -            |

:ballot_box_with_check: :white_check_mark: :heavy_check_mark: &check; :x: &#10060;
