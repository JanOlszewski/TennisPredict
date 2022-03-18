CREATE TABLE "atp_ranking" (
  "rank_id" int PRIMARY KEY,
  "ranking_date" date,
  "rank" int,
  "player" int,
  "points" int
);

CREATE TABLE "player" (
  "player_id" int PRIMARY KEY,
  "name_first" varchar(120),
  "name_last" varchar(120),
  "hand" varchar(10),
  "birth_date" integer,
  "country_cd" varchar(8),
  "height" int,
  "wikidata_id" varchar(24)
);

CREATE TABLE "atp_match" (
  "atp_match_id" int PRIMARY KEY,
  "tourney_id" varchar(60),
  "tourney_name" varchar(120),
  "surface" varchar(30),
  "draw_size" int,
  "tourney_level" varchar(8),
  "tourney_date" date,
  "match_num" int,
  "winner_id" int,
  "winner_seed" int,
  "winner_entry" varchar(8),
  "loser_id" int,
  "loser_seed" int,
  "loser_entry" varchar(8),
  "score" varchar(60),
  "best_of" int,
  "match_round" varchar(8),
  "minutes" int,
  "w_ace" int,
  "w_df" int,
  "w_svpt" int,
  "w_1stln" int,
  "w_1stWon" int,
  "w_2ndWon" int,
  "w_SvGms" int,
  "w_bpSaved" int,
  "w_bpFaced" int,
  "l_ace" int,
  "l_df" int,
  "l_svpt" int,
  "l_1stln" int,
  "l_1stWon" int,
  "l_2ndWon" int,
  "l_SvGms" int,
  "l_bpSaved" int,
  "l_bpFaced" int,
  "w_rank_id" int,
  "l_rank_id" int
);

ALTER TABLE "atp_ranking" ADD FOREIGN KEY ("player") REFERENCES "player" ("player_id");

ALTER TABLE "atp_match" ADD FOREIGN KEY ("winner_id") REFERENCES "player" ("player_id");

ALTER TABLE "atp_match" ADD FOREIGN KEY ("loser_id") REFERENCES "player" ("player_id");

ALTER TABLE "atp_match" ADD FOREIGN KEY ("w_rank_id") REFERENCES "atp_ranking" ("rank_id");

ALTER TABLE "atp_match" ADD FOREIGN KEY ("l_rank_id") REFERENCES "atp_ranking" ("rank_id");
