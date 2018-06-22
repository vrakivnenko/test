#!/bin/bash
da(){
    errors=0
    for i in $( find . -name "*.sh" );
    do
        if shellcheck "$i";
        then
        :
        else
            (( errors++ ))
        fi
    done
    return "$errors"
}
da