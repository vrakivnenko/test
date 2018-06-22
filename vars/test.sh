#!/bin/bash
da(){
    errors=0
    for i in $( find $GIT_URL -name "*.sh" );
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