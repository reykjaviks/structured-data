(ns structured-data)

(defn do-a-thing [x]
  (let [sum (+ x x)]
    (Math/pow sum sum)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [[v1 v2 v3]]
  (+ v1 v3))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [[[w1 h1] [w2 h2]]]
  (- w2 w1))

(defn height [[[wi1 h1] [w2 h2]]]
  (- h2 h1))

(defn square? [rectangle]
  (== (height rectangle) (width rectangle)))

(defn area [rectangle]
  (* (width rectangle) (height rectangle)))

(defn contains-point? [[[w1 h1] [w2 h2]] [w3 h3]]
  (and (<= w1 w2 w3) (<= h1 h2 h3)))

(defn contains-rectangle? [outer inner]
  :-)

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
