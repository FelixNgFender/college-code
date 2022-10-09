; ;;;;;;;;;;;;;;
; ; Questions ;;
; ;;;;;;;;;;;;;;
; Scheme
(define (cddr s) (cdr (cdr s)))

(define (cadr s) 'YOUR-CODE-HERE (car (cdr s)))

(define (caddr s)
  'YOUR-CODE-HERE
  (car (cdr (cdr s)))
)

(define (sign x)
  'YOUR-CODE-HERE
  (cond 
    ((< x 0) -1)
    ((> x 0) 1)
    ((= x 0) 0)
  )
)

(define (square x) (* x x))

(define (pow b n)
  'YOUR-CODE-HERE
  (cond 
    ((= n 0)   1)
    ((even? n) (square (pow b (/ n 2))))
    (else      (* b (pow b (- n 1))))
  )
)

(define (unique s) 
  'YOUR-CODE-HERE
  
)
