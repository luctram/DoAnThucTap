using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BGScaler : MonoBehaviour {

	// Use this for initialization
	void Start () {
        SpriteRenderer sr = GetComponent<SpriteRenderer>();
        Vector3 tempScale = transform.localScale;

        float height = sr.bounds.size.y;
        float width = sr.bounds.size.x;

        float heightGame = Camera.main.orthographicSize * 2f;
        float widthGame = heightGame * Screen.width/ Screen.height;

        tempScale.y = heightGame / height;
        tempScale.x = widthGame / width;

        transform.localScale = tempScale;
    }
	
}
